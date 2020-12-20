/*
 *    Copyright 2020 Just Learn Java
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.example.primitive.wrapper;

/**
 * Code to use the Java SDK wrapper classes to create
 * objects using valueOf() and via auto-boxing.
 */
public class PrimitiveWrapper {

  private static final System.Logger logger = System.getLogger(PrimitiveWrapper.class.getName());

  private static final System.Logger.Level INFO = System.Logger.Level.INFO;

  public static void main(final String[] args) {
    PrimitiveWrapper primitiveWrapper = new PrimitiveWrapper();

    // Create objects using java.lang wrapper classes
    primitiveWrapper.createUsingWrappers();

    // Create objects by auto-boxing a literal value
    primitiveWrapper.createUsingAutoboxing();

  }

  private void createUsingWrappers() {
    // Create objects using valueOf() on each wrapper type
    Boolean booleanObject = Boolean.valueOf(true); // Create Boolean object - true
    logger.log(INFO, "Boolean object: " + booleanObject);

    Character characterObject = Character.valueOf('a'); // Create Character object - 'a'
    logger.log(INFO, "Character object: " + characterObject);

    Float floatObject = Float.valueOf(3.14159f); // Create Float object - 3.14159 (PI to 5 decimal places)
    logger.log(INFO, "Float object: " + floatObject);

    Double doubleObject = Double.valueOf(6.62607015e-34); // Create Double object - 6.62607015 x 10^-34 (Planck's constant)
    logger.log(INFO, "Double object: " + doubleObject);

    Byte byteObject = Byte.valueOf((byte) 100); // Create Byte object - 100
    logger.log(INFO, "Byte object: " + byteObject);

    Short shortObject = Short.valueOf((short) 1000); // Create Short object - 1000
    logger.log(INFO, "Short object: " + shortObject);

    Integer integerObject = Integer.valueOf(100_000); // Create Integer object - 100,000
    logger.log(INFO, "Integer object: " + integerObject);

    Long longObject = Long.valueOf(10_000_000_000L); // Create Long object - 10,000,000,000
    logger.log(INFO, "Long object: " + longObject);
  }

  private void createUsingAutoboxing() {
    // Create objects using auto-boxing
    Boolean booleanObject = true; // Create Boolean object using literal - true
    logger.log(INFO, "Boolean object: " + booleanObject);

    Character characterObject = 'a'; // Create Character object using literal - 'a'
    logger.log(INFO, "Character object: " + characterObject);

    Float floatObject = 3.14159f; // Create Float object using literal - 3.14159
    logger.log(INFO, "Float object: " + floatObject);

    Double doubleObject = 6.62607015e-34; // Create Double literal - 6.62607015 x 10^-34 (Planck's constant)
    logger.log(INFO, "Double object: " + doubleObject);

    Byte byteObject = 100; // Create Byte literal - 100
    logger.log(INFO, "Byte object: " + byteObject);

    Short shortObject = 1000; // Create Short literal - 1000
    logger.log(INFO, "Short object: " + shortObject);

    Integer integerObject = 100_000; // Create Integer literal - 100,000
    logger.log(INFO, "Integer object: " + integerObject);

    Long longObject = 10_000_000_000L; // Create Long literal - 10,000,000,000
    logger.log(INFO, "Long object: " + longObject);
  }

}
