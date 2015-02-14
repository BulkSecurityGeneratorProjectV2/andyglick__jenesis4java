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
 * <code>Statement</code> subinterface for the <code>try catch
 * finally</code> construct.
 */
public interface Try extends Statement, Block {

    /**
     * Gets the list of catches as an list of <code>Catch</code>.
     */
    List<Catch> getCatches();

    /**
     * Gets the optional <code>Finally</code> statement.
     */
    Finally getFinally();

    /**
     * Adds a new <code>Catch</code> statement to this <code>Try</code>.
     */
    Catch newCatch(Type type, String name);

    /**
     * Adds a new resource declaration to this {@code Try}.
     * @param type
     * @param name
     * @param expr
     */
    TryResource newResource(Type type, String name, Expression expr);
}
