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
 * <code>Declaration</code> subinterface for type declaration including class
 * and interface delcarations.
 */
public interface TypeDeclaration extends Member {

    /**
     * @return the class as a <code>Type</code>
     */
    ClassType asClassType();

    /**
     * @return the list of member declarations as an list of <code>Member</code>
     *         .
     */
    List<Member> getMembers();

    /**
     * @return the enclosing compilation unit.
     */
    CompilationUnit getUnit();

    /**
     * remove a member from the members and return true if the element was in
     * the list.
     */
    boolean removeMember(Member member);

}
