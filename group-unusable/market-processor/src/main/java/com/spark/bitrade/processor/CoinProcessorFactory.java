package com.spark.bitrade.processor;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j


public class CoinProcessorFactory {
    private HashMap<String,CoinProcessor> processorMap; //yangch：按交易对存放

    public CoinProcessorFactory(){
        processorMap = new HashMap<>();
    }

    public void addProcessor(String symbol, CoinProcessor processor){
        log.info("CoinProcessorFactory addProcessor = {}" , symbol);
        processorMap.put(symbol,processor);
    }

    public CoinProcessor getProcessor(String symbol){
        return processorMap.get(symbol);
    }

    public HashMap<String, CoinProcessor> getProcessorMap() {
        return processorMap;
    }

    public void removeProcessor(String symbol){
        processorMap.remove(symbol);
    }
}
