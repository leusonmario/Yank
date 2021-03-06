/**
 * Copyright 2011 - 2013 Xeiam LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xeiam.yank.exceptions;

/**
 * An exception to indicate that a Connection pool could not be found given the Connection pool name.
 * 
 * @author timmolter
 */
public class PropertiesFileNotFoundException extends RuntimeException {

  /**
   * Constructor
   * 
   * @param message
   * @param cause
   */
  public PropertiesFileNotFoundException(String message, Throwable cause) {

    super(message, cause);
  }

}
