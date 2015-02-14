package net.sourceforge.jenesis4java;

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
 * The <code>Comment</code> superinterface.
 */
public interface Comment extends Codeable {

    /**
     * Type constant for a single line comment.
     */
    static final int S = 1;

    /**
     * Type constant for a multiple line comment.
     */
    static final int M = 2;

    /**
     * Type constant for a multiple line comment, but only at the beginning and
     * at the end.
     */
    static final int Mbe = 3;

    /**
     * Type constant for a documentation comment.
     */
    static final int D = 4;

    /**
     * Gets the text for this comment.
     */
    String getText();

    /**
     * Sets the text for this comment.
     */
    Comment setText(String text);

    /**
     * Returns the type of this comment.
     */
    int type();
}
