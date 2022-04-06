package com.bean;

import java.util.List;

public class Singer {
   //POJO
  private  String singerName;
  private  String singerBirthday;
  private  int age;
  private List<String> songList;

  //Getter and Setter


    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getSingerBirthday() {
        return singerBirthday;
    }

    public void setSingerBirthday(String singerBirthday) {
        this.singerBirthday = singerBirthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSongList() {
        return songList;
    }

    public void setSongList(List<String> songList) {
        this.songList = songList;
    }
    public  void display(){

        System.out.println("Name::"+getSingerName());
        System.out.println("Age::"+getAge());
        System.out.println("Singer Birthdate::"+getSingerBirthday());

        List<String> l=getSongList();
      for (String v:l){
          System.out.println(v);
      }

    }


}
