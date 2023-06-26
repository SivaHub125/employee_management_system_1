package com.project.employee_management_system.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
        @Id
        @Column(name="id")
        private long id;
        @Column(name = "name")
        private String name;
        @Column(name = "age")
        private int age;
        @Column(name = "email_id")
        private String email_id;
        @Column(name = "gen")
        private Character gen;
        @Column(name = "dept")
        private String dept;
        @Column(name="phone_no")
        private long phone_no;
        public long getId() {
            return id;
        }
        public void setId(long id) {
            this.id = id;
        }
        public long getPhone_no() {
                return phone_no;
        }
        public void setPhone_no(long phone_no) {
                this.phone_no = phone_no;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getEmail_id() {
            return email_id;
        }
        public void setEmail_id(String email_id) {
            this.email_id = email_id;
        }
        public String getDept() {
            return dept;
        }
        public void setDept(String dept) {
            this.dept = dept;
        }
        public int getAge(){return age;}
        public void setAge(int age) {this.age = age;}
        public Character getGen() {return gen;}
        public void setGen(Character gen) {this.gen = gen;}
}
