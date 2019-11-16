package com.sanlly.auth.core;

import java.util.Collection;

public interface ICacheManager<K,V> {
	V get(K key);
	
	V set(K key,V value);
	
	V remove(K key);

	Collection<V> values();
}
