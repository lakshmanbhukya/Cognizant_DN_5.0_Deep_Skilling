package org.example.builder;

public class Computer {
    private String cpu;
    private String ram;
    private String disk;
    private String gpu;
    private boolean haswifi;

    private Computer(Builder builder){
        this.cpu=builder.cpu;
        this.ram=builder.ram;
        this.disk=builder.disk;
        this.gpu=builder.gpu;
        this.haswifi=builder.haswifi;
    }

    public static  class Builder{
        private String cpu;
        private String ram;
        private String disk;
        private String gpu;
        private boolean haswifi;

        public Builder(String cpu,String ram){
            this.cpu=cpu;
            this.ram=ram;
        }

        public Builder disk(String disk){
            this.disk=disk;
            return this;
        }
        public Builder gpu(String gpu){
            this.gpu=gpu;
            return this;
        }
        public Builder haswifi(boolean haswifi){
            this.haswifi=haswifi;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
