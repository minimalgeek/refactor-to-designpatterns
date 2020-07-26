package com.csmastery.builder;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UserTest {

  @Test
  public void userShouldntExistWithoutEmail() throws Exception {
    assertThatThrownBy(() -> new User()).hasMessage("Email shouldn't be empty");
  }
  
  @Test
  public void simpleUserWithEmail() throws Exception {
    User user = new User("peti@gmail.com");
    assertThat(user).hasFieldOrPropertyWithValue("email", "peti@gmail.com")
                    .hasFieldOrPropertyWithValue("age", 0);
  }


  @Test
  public void simpleUserWithAgeAndEmail() throws Exception {
    User user = new User("peti@gmail.com", 33);
    assertThat(user).hasFieldOrPropertyWithValue("email", "peti@gmail.com")
                    .hasFieldOrPropertyWithValue("age", 33);
  }

  @Test
  public void simpleUserWithNameAndEmail() throws Exception {
    User user = new User("peti@gmail.com", "Peti");
    assertThat(user).hasFieldOrPropertyWithValue("email", "peti@gmail.com")
                    .hasFieldOrPropertyWithValue("name", "Peti");
  }

  @Test
  public void simpleUserWithHeightAndEmail() throws Exception {
    User user = new User("peti@gmail.com", 1.93d);
    assertThat(user).hasFieldOrPropertyWithValue("email", "peti@gmail.com")
                    .hasFieldOrPropertyWithValue("height", 1.93d);
  }

  @Test
  public void simpleUserWithNameAndAgeAndHeightAndEmail() throws Exception {
    User user = new User("peti@gmail.com", "Peti", 30, 1.85d);
    assertThat(user).hasFieldOrPropertyWithValue("email", "peti@gmail.com").hasFieldOrPropertyWithValue("name", "Peti")
        .hasFieldOrPropertyWithValue("age", 30).hasFieldOrPropertyWithValue("height", 1.85d);
  }
  
}