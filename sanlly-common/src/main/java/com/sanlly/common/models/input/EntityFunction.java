package com.sanlly.common.models.input;

import java.io.Serializable;
import java.util.function.Function;

/**
 * 
 * @author RexSheng
 * 2019年11月11日 下午2:51:42
 * @param <T>
 * @param <R>
 */
public interface EntityFunction<T, R> extends Function<T, R>, Serializable {
	
}
