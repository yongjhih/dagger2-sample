/*
* Copyright (C) 2015 Google, Inc.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package test.membersinject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MembersInjectTest {
  @Test public void testMembersInject_arrays() {
    MembersInjectComponent component = DaggerMembersInjectComponent.builder().build();
    
    ChildOfStringArray childOfStringArray = new ChildOfStringArray();
    component.inject(childOfStringArray);
  }

  @Test public void testMembersInject_nestedArrays() {
    MembersInjectComponent component = DaggerMembersInjectComponent.builder().build();
    
    ChildOfArrayOfParentOfStringArray childOfArrayOfParentOfStringArray =
        new ChildOfArrayOfParentOfStringArray();
    component.inject(childOfArrayOfParentOfStringArray);
  }

  @Test public void testMembersInject_primitives() {
    MembersInjectComponent component = DaggerMembersInjectComponent.builder().build();
    
    ChildOfPrimitiveIntArray childOfPrimitiveIntArray = new ChildOfPrimitiveIntArray();
    component.inject(childOfPrimitiveIntArray);
  }
}
