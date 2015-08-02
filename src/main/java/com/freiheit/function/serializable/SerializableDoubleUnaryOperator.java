package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.DoubleUnaryOperator;

/**
 * Serializable version of {@link DoubleUnaryOperator}.
 * 
 * @see DoubleUnaryOperator
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableDoubleUnaryOperator extends DoubleUnaryOperator, Serializable {
    //nothing
}
