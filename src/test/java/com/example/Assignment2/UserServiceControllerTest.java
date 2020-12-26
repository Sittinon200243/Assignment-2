package com.example.Assignment2;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class UserServiceControllerTest {
	
  @Autowired
  private MockMvc mvc;
  
  @Test
  public void Login_Page() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/index.html")
        .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }
  
  /*@Test
  public void WhenInputAndOutput() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/checkLogin")
        .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
    	.andExpect(content().string(equalTo("{\"username\":null,\"password\":null,\"loginStatus\":null}")));
  }*/
}
