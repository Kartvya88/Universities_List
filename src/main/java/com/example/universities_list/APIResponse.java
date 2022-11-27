package com.example.universities_list;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class APIResponse {
   private Uni[] uni;

   public Uni[] getUni() {
      return uni;
   }

   public List<Uni> getContentAsList(){
      return Arrays.asList(uni);
   }
}

