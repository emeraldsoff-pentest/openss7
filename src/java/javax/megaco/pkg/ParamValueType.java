// vim: sw=4 et tw=72 com=srO\:/**,mb\:*,ex\:*/,srO\:/*,mb\:*,ex\:*/,b\:TRANS,\://,b\:#,\:%,\:XCOMM,n\:>,fb\:-
/*
 @(#) src/java/javax/megaco/pkg/ParamValueType.java <p>
 
 Copyright &copy; 2008-2015  Monavacon Limited <a href="http://www.monavacon.com/">&lt;http://www.monavacon.com/&gt;</a>. <br>
 Copyright &copy; 2001-2008  OpenSS7 Corporation <a href="http://www.openss7.com/">&lt;http://www.openss7.com/&gt;</a>. <br>
 Copyright &copy; 1997-2001  Brian F. G. Bidulock <a href="mailto:bidulock@openss7.org">&lt;bidulock@openss7.org&gt;</a>. <p>
 
 All Rights Reserved. <p>
 
 This program is free software: you can redistribute it and/or modify it under
 the terms of the GNU Affero General Public License as published by the Free
 Software Foundation, version 3 of the license. <p>
 
 This program is distributed in the hope that it will be useful, but <b>WITHOUT
 ANY WARRANTY</b>; without even the implied warranty of <b>MERCHANTABILITY</b>
 or <b>FITNESS FOR A PARTICULAR PURPOSE</b>.  See the GNU Affero General Public
 License for more details. <p>
 
 You should have received a copy of the GNU Affero General Public License along
 with this program.  If not, see
 <a href="http://www.gnu.org/licenses/">&lt;http://www.gnu.org/licenses/&gt</a>,
 or write to the Free Software Foundation, Inc., 675 Mass Ave, Cambridge, MA
 02139, USA. <p>
 
 <em>U.S. GOVERNMENT RESTRICTED RIGHTS</em>.  If you are licensing this
 Software on behalf of the U.S. Government ("Government"), the following
 provisions apply to you.  If the Software is supplied by the Department of
 Defense ("DoD"), it is classified as "Commercial Computer Software" under
 paragraph 252.227-7014 of the DoD Supplement to the Federal Acquisition
 Regulations ("DFARS") (or any successor regulations) and the Government is
 acquiring only the license rights granted herein (the license rights
 customarily provided to non-Government users).  If the Software is supplied to
 any unit or agency of the Government other than DoD, it is classified as
 "Restricted Computer Software" and the Government's rights in the Software are
 defined in paragraph 52.227-19 of the Federal Acquisition Regulations ("FAR")
 (or any successor regulations) or, in the cases of NASA, in paragraph
 18.52.227-86 of the NASA Supplement to the FAR (or any successor regulations). <p>
 
 Commercial licensing and support of this software is available from OpenSS7
 Corporation at a fee.  See
 <a href="http://www.openss7.com/">http://www.openss7.com/</a>
 */

// vim: sw=4 et tw=72 com=srO\:/**,mb\:*,ex\:*/,srO\:/*,mb\:*,ex\:*/,b\:TRANS,\://,b\:#,\:%,\:XCOMM,n\:>,fb\:-
/*

   Overview Package  Class Tree Index Help
   JAIN^TM MEGACO API (RELEASE) - Version 1.0 - 22 December 2003
    PREV CLASS   NEXT CLASS FRAMES  NO FRAMES
   SUMMARY:  INNER | FIELD |  CONSTR | METHOD DETAIL:  FIELD | CONSTR |
   METHOD
     _________________________________________________________________

javax.megaco.pkg
Class ParamValueType

java.lang.Object
  |
  +--javax.megaco.pkg.ParamValueType

   All Implemented Interfaces:
          java.io.Serializable
     _________________________________________________________________

   public final class ParamValueType
   extends java.lang.Object

   Constants used in package javax.megaco.pkg for defining the parameter
   value type.

   See Also:
          Serialized Form
     _________________________________________________________________

   Field Summary
   static int M_ITEM_PARAM_VALUE_STRING
              Identifies item/parameter value type to be of the type
   string.
   static int M_ITEM_PARAM_VALUE_INTEGER
              Identifies item/parameter value type to be of the type
   integer.
   static int M_ITEM_PARAM_VALUE_BOOLEAN
              Identifies item/parameter value type to be of the type
   boolean.
   static int M_ITEM_PARAM_VALUE_DOUBLE
              Identifies item/parameter value type to be of the type
   double.

                                                                   static

   ParamValueType ITEM_PARAM_VALUE_STRING
              Identifies a ParamValueType object that constructs the
   class with the constant M_ITEM_PARAM_VALUE_STRING.

                                                                   static

   ParamValueType ITEM_PARAM_VALUE_INTEGER
              Identifies a ParamValueType object that constructs the
   class with the constant M_ITEM_PARAM_VALUE_INTEGER.

                                                                   static

   ParamValueType ITEM_PARAM_VALUE_BOOLEAN
              Identifies a ParamValueType object that constructs the
   class with the constant M_ITEM_PARAM_VALUE_BOOLEAN.

                                                                   static

   ParamValueType ITEM_PARAM_VALUE_DOUBLE
              Identifies a ParamValueType object that constructs the
   class with the constant M_ITEM_PARAM_VALUE_DOUBLE.

   Constructor Summary
   ParamValueType(int value_type)
              Constructs a class initialised with value type as passed to
   it in the constructor.

   Method Summary
   int getParamValueType()
             Returns one of the allowed integer values defined as static
   fields in this class which shall identify one of the parameter value
   types.

                                                                   static

   ParamValueType getObject(int value)
           throw IllegalArgumentException()

             Returns reference of the ParamValueType object that
   identifies the type of the parameter value.

                                                                   object

   readResolve()
              throws ObjectStreamException()

              This method is required to perform instance substitution
   during serialization.

   Methods inherited from class java.lang.Object
   clone, equals, finalize, getClass, hashCode, notify, notifyAll,
   toString, wait

   Field Detail

  M_ITEM_PARAM_VALUE_STRING

public static final int M_ITEM_PARAM_VALUE_STRING

          Identifies item/parameter value type to be of the type string.
          Its value shall be set equal to 1.
     _________________________________________________________________

  M_ITEM_PARAM_VALUE_INTEGER

public static final int M_ITEM_PARAM_VALUE_INTEGER

          Identifies item/parameter value type to be of the type integer.
          Its value shall be set equal to 2.
     _________________________________________________________________

  M_ITEM_PARAM_VALUE_BOOLEAN

public static final int M_ITEM_PARAM_VALUE_BOOLEAN

          Identifies item/parameter value type to be of the type boolean.
          Its value shall be set equal to 3.
     _________________________________________________________________

  M_ITEM_PARAM_VALUE_DOUBLE

public static final int M_ITEM_PARAM_VALUE_DOUBLE

          Identifies item/parameter value type to be of the type double.
          Its value shall be set equal to 4.
     _________________________________________________________________

  ITEM_PARAM_VALUE_STRING

public static final ParamValueType ITEM_PARAM_VALUE_STRING

        = new ParamValueType(M_ITEM_PARAM_VALUE_STRING);

          Identifies a parameter value type object that constructs the
          class with the constant M_ITEM_PARAM_VALUE_STRING. Since it is
          reference to static final object, it prevents further
          instantiation of the same object in the system.
     _________________________________________________________________

  ITEM_PARAM_VALUE_INTEGER

public static final ParamValueType ITEM_PARAM_VALUE_INTEGER

        = new ParamValueType(M_ITEM_PARAM_VALUE_INTEGER);

          Identifies a parameter value type object that constructs the
          class with the constant M_ITEM_PARAM_VALUE_INTEGER. Since it is
          reference to static final object, it prevents further
          instantiation of the same object in the system.
     _________________________________________________________________

  ITEM_PARAM_VALUE_BOOLEAN

public static final ParamValueType ITEM_PARAM_VALUE_BOOLEAN

        = new ParamValueType(M_ITEM_PARAM_VALUE_BOOLEAN);

          Identifies a parameter value type object that constructs the
          class with the constant M_ITEM_PARAM_VALUE_BOOLEAN. Since it is
          reference to static final object, it prevents further
          instantiation of the same object in the system.
     _________________________________________________________________

  ITEM_PARAM_VALUE_DOUBLE

public static final ParamValueType ITEM_PARAM_VALUE_DOUBLE

        = new ParamValueType(M_ITEM_PARAM_VALUE_DOUBLE);

          Identifies a parameter value type object that constructs the
          class with the constant M_ITEM_PARAM_VALUE_DOUBLE. Since it is
          reference to static final object, it prevents further
          instantiation of the same object in the system.
     _________________________________________________________________

   Constructor Detail

  ParamValueType

private ParamValueType(int value_type)

          Constructs an abstract class that specifies the parameter value
          type. This field is used in the package/item classes when
          specifying the parameter values.
     _________________________________________________________________

   Method Detail

  getParamValueType

public int getParamValueType()

          This method returns one of the static field constants defined
          in this class.


        Returns:
                Returns an integer value that identifies the parameter
                value type to be one of STRING, or INTEGER or BOOLEAN or
                DOUBLE.
     _________________________________________________________________

  getObject

public static final ParamValueType getObject(int value)
                throws IllegalArgumentException()

          Returns reference of the ParamValueType object that identifies
          the parameter value type as value passed to this method.


                Parameters:
                          value - It is one of the possible values of the
                static constant that this class provides.

        Returns:
                Returns reference of the ParamValueType object.

        throws:
                IllegalArgumentException() - If the value passed to this
                method is invalid, then this exception is raised.
     _________________________________________________________________

  readResolve

private Object readResolve()

        This method must be implemented to perform instance substitution
   during serialization. This method is required for reference
   comparison. This method if not implimented will simply fail each time
   we compare an Enumeration value against a de-serialized Enumeration
   instance.
     _________________________________________________________________
     _________________________________________________________________

   Overview Package  Class Tree Index Help
   JAIN^TM MEGACO API (RELEASE) - Version 1.0 - 22 December 2003
    PREV CLASS   NEXT CLASS FRAMES  NO FRAMES
   SUMMARY:  INNER | FIELD | CONSTR | METHOD DETAIL:  FIELD | CONSTR |
   METHOD
     _________________________________________________________________

                  Copyright (C) 2001 Hughes Software Systems
       HUGHES SOFTWARE SYSTEMS and JAIN JSPA SIGNATORIES PROPRIETARY
        This document contains proprietary information that shall be
     distributed, routed or made available only within Hughes Software
       Systems and JAIN JSPA Signatory Companies, except with written
                   permission of Hughes Software Systems
             _________________________________________________

   22 December 2003


    If you have any comments or queries, please mail them to
    Jmegaco_hss@hss.hns.com
*/
