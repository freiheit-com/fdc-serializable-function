package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.UnaryOperator;

/**
 * Serializable version of {@link UnaryOperator}.
 * 
 * @param <T>
 *            the type of the operand and result of the operator
 * 
 * @see UnaryOperator
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableUnaryOperator<T> extends UnaryOperator<T>, Serializable {
    //nothing
}
