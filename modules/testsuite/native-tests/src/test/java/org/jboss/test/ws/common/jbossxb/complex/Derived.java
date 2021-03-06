/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2006, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.test.ws.common.jbossxb.complex;



/**
 * A derived complexType
 *
 * See jaxrpc-1.1 (5.4)
 *
 * @author Thomas.Diesler@jboss.org
 * @since 14-Oct-2004
 */
public class Derived extends Base
{
   public int x;
   private int y;

   public Derived()
   {
   }

   public boolean equals(Object o)
   {
      if (this == o) return true;
      if (!(o instanceof Derived)) return false;
      if (!super.equals(o)) return false;

      final Derived derived = (Derived)o;

      if (x != derived.x) return false;
      if (y != derived.y) return false;

      return true;
   }

   public int hashCode()
   {
      int result = super.hashCode();
      result = 29 * result + x;
      result = 29 * result + y;
      return result;
   }

   public String toString()
   {
      return "[a=" + a + ",b=" + getB() + ",x=" + x + ",y=" +  y + "]";
   }
}
