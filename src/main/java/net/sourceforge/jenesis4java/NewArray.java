package net.sourceforge.jenesis4java;

import java.util.List;

/**
 * Copyright (C) 2008, 2010 Richard van Nieuwenhoven - ritchie [at] gmx [dot] at
 * Copyright (C) 2000, 2001 Paul Cody Johnston - pcj@inxar.org <br>
 * This file is part of Jenesis4java. Jenesis4java is free software: you can
 * redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.<br>
 * Jenesis4java is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.<br>
 * You should have received a copy of the GNU Lesser General Public License
 * along with Jenesis4java. If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * <code>Expression</code> subinterface for expressions which create new arrays.
 */
public interface NewArray extends Expression {

    /**
     * Sets the given dimension without an argument ([]).
     */
    NewArray addDim();

    /**
     * Sets the given expression for the given dimension. To specify a dimension
     * without an argument, set the expr to <code>null</code>.
     */
    NewArray addDim(Expression e);

    /**
     * Gets the list of dimension expressions as an list of
     * <code>Expression</code>.
     */
    List<Expression> getDims();

    /**
     * Gets the array initialization expression.
     */
    ArrayInitializer getInitializer();

    /**
     * Sets the array initialization expressions as an arbitrarily nested
     * array[n] of expressions.
     */
    NewArray setInitializer(ArrayInitializer ai);

    /**
     * Sets the given type for this array creation. The Type should be a class
     * or primitive type, not an array type.
     */
    NewArray setType(Type type);
}
