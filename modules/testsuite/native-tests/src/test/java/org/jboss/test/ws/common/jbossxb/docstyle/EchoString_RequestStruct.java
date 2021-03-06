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

// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.2_01, build R40)
package org.jboss.test.ws.common.jbossxb.docstyle;


public class EchoString_RequestStruct
{
   protected String String_1;
   protected String String_2;

   public EchoString_RequestStruct()
   {
   }

   public EchoString_RequestStruct(String String_1, String String_2)
   {
      this.String_1 = String_1;
      this.String_2 = String_2;
   }

   public String getString_1()
   {
      return String_1;
   }

   public void setString_1(String String_1)
   {
      this.String_1 = String_1;
   }

   public String getString_2()
   {
      return String_2;
   }

   public void setString_2(String String_2)
   {
      this.String_2 = String_2;
   }

   public boolean equals(Object o)
   {
      if (this == o) return true;
      if (!(o instanceof EchoString_RequestStruct)) return false;

      final EchoString_RequestStruct echoString_requestStruct = (EchoString_RequestStruct)o;

      if (String_1 != null ? !String_1.equals(echoString_requestStruct.String_1) : echoString_requestStruct.String_1 != null) return false;
      if (String_2 != null ? !String_2.equals(echoString_requestStruct.String_2) : echoString_requestStruct.String_2 != null) return false;

      return true;
   }

   public int hashCode()
   {
      int result;
      result = (String_1 != null ? String_1.hashCode() : 0);
      result = 29 * result + (String_2 != null ? String_2.hashCode() : 0);
      return result;
   }

   public String toString()
   {
      return "[String_1=" + String_1 + ",String_2=" + String_2 + "]";
   }
}
