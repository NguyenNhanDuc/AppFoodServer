package com.example.androideatitv2server.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CartItem {
        private String foodId;

        private String foodName;

        private String foodImage;

        private double foodPrice;

        private int foodQuantity;

        private String userPhone;

        private double foodExtraPrice;

        private String foodAddon;

        private String foodSize;

        private String uid;

        public CartItem(@NonNull String foodId, String foodName, String foodImage, double foodPrice,
                        int foodQuantity, String userPhone, double foodExtraPrice, String foodAddon,
                        String foodSize, String uid) {
            this.foodId = foodId;
            this.foodName = foodName;
            this.foodImage = foodImage;
            this.foodPrice = foodPrice;
            this.foodQuantity = foodQuantity;
            this.userPhone = userPhone;
            this.foodExtraPrice = foodExtraPrice;
            this.foodAddon = foodAddon;
            this.foodSize = foodSize;
            this.uid = uid;
        }

        public CartItem() {
        }

        @NonNull
        public String getFoodId() {
            return foodId;
        }

        public void setFoodId(@NonNull String foodId) {
            this.foodId = foodId;
        }

        public String getFoodName() {
            return foodName;
        }

        public void setFoodName(String foodName) {
            this.foodName = foodName;
        }

        public String getFoodImage() {
            return foodImage;
        }

        public void setFoodImage(String foodImage) {
            this.foodImage = foodImage;
        }

        public double getFoodPrice() {
            return foodPrice;
        }

        public void setFoodPrice(double foodPrice) {
            this.foodPrice = foodPrice;
        }

        public int getFoodQuantity() {
            return foodQuantity;
        }

        public void setFoodQuantity(int foodQuantity) {
            this.foodQuantity = foodQuantity;
        }

        public String getUserPhone() {
            return userPhone;
        }

        public void setUserPhone(String userPhone) {
            this.userPhone = userPhone;
        }

        public double getFoodExtraPrice() {
            return foodExtraPrice;
        }

        public void setFoodExtraPrice(double foodExtraPrice) {
            this.foodExtraPrice = foodExtraPrice;
        }

        public String getFoodAddon() {
            return foodAddon;
        }

        public void setFoodAddon(String foodAddon) {
            this.foodAddon = foodAddon;
        }

        public String getFoodSize() {
            return foodSize;
        }

        public void setFoodSize(String foodSize) {
            this.foodSize = foodSize;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        //Ctrl+O
        @Override
        public boolean equals(@Nullable Object obj) {
            if (obj == this)
                return true;
            if (!(obj instanceof CartItem))
                return false;
            CartItem cartItem = (CartItem) obj;
            return cartItem.getFoodId().equals(this.foodId)&&
                    cartItem.getFoodAddon().equals(this.foodAddon)&&
                    cartItem.getFoodSize().equals(this.foodSize);
        }
}