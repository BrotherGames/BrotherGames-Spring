package com.eci.cosw.springbootsecureapi.model;

public class Seller {

        private String platform;
        private long price;
        private String link;



        public Seller(){

        }

        public Seller(String platform,long price,String link){
            this.platform=platform;
            this.price=price;
            this.link=link;

        }


        public String getPlatform() {
            return platform;
        }
        public long getPrice() {
            return price;
        }
        public String getLink() {
            return link;
        }

        public void setPlatform(String platform){this.platform=platform;}
        public void setPrice(long price) {
            this.price=price;
        }
        public void setLink(String link) {
            this.link=link;
        }
       


}
