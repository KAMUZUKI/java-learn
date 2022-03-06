package com.example.bean;

public class DUser {
    private Integer id;
    private String name;
    private Integer age;
    private Integer search_count;

    public DUser() {
    }

    public DUser(Integer id, String name, Integer age, Integer search_count) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.search_count = search_count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSearch_count() {
        return search_count;
    }

    public void setSearch_count(Integer search_count) {
        this.search_count = search_count;
    }

    @Override
    public String toString() {
        return "DUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", search_count=" + search_count +
                '}';
    }
}
