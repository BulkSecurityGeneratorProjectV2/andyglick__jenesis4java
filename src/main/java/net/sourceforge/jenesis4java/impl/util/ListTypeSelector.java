package net.sourceforge.jenesis4java.impl.util;

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTypeSelector {

    public static <TYPE> List<TYPE> select(List<TYPE> list) {
        return Collections.unmodifiableList(list);
    }

    public static <TYPE, SUBTYPE extends TYPE> List<SUBTYPE> select(List<TYPE> list, Class<SUBTYPE> clazz) {
        List<SUBTYPE> result = new ArrayList<SUBTYPE>();
        for (TYPE element : list) {
            if (clazz.isAssignableFrom(element.getClass())) {
                result.add(clazz.cast(element));
            }
        }
        return Collections.unmodifiableList(result);
    }

    public static <TYPE, SUBTYPE extends TYPE> List<TYPE> generalize(List<SUBTYPE> list, Class<TYPE> clazz) {
        List<TYPE> result = new ArrayList<TYPE>();
        for (TYPE element : list) {
            result.add(element);
        }
        return Collections.unmodifiableList(result);
    }
}
