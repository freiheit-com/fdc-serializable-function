package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.BinaryOperator;

/**
 * Serializable version of {@link BinaryOperator}.
 * 
 * @param <T>
 *            the type of the operands and result of the operator
 * 
 * @see BinaryOperator
 * @author Michael Bohn (initial creation).
 */
@FunctionalInterface
public interface SerializableBinaryOperator<T> extends BinaryOperator<T>, Serializable {
    //nothing
}
