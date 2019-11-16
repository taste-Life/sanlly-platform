package com.sanlly.auth.core;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class DefaultCacheManager<K,V> implements ICacheManager<K,V>{

	private ConcurrentMap<K, V> cacheList;
	
	
	public DefaultCacheManager(){
		cacheList=new ConcurrentHashMap<K, V>();
	}
	
	public V get(K key){
		V value=cacheList.get(key);
		return value;
	}
	
	public V set(K key,V value){
		V newValue=cacheList.putIfAbsent(key, value);
		return newValue;
	}
	
	public V remove(K key){
		return cacheList.remove(key);
	}
	
	@Override
	public Collection<V> values() {
		return cacheList.values();
	}
	
}
