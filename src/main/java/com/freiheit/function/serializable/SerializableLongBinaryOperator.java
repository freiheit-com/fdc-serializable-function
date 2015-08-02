package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.LongBinaryOperator;

/**
 * Serializable version of {@link LongBinaryOperator}.
 * 
 * @see LongBinaryOperator
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableLongBinaryOperator extends LongBinaryOperator, Serializable {
    //nothing
}
