package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.LongUnaryOperator;

/**
 * Serializable version of {@link LongUnaryOperator}.
 * 
 * @see LongUnaryOperator
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableLongUnaryOperator extends LongUnaryOperator, Serializable {
    //nothing
}
