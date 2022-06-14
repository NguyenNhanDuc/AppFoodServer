package com.example.androideatitv2server.EventBus;

import com.example.androideatitv2server.model.AddonModel;

import java.util.List;

public class UpdateAddonModel {
    private List<AddonModel> addonModels;

    public UpdateAddonModel() {
    }

    public UpdateAddonModel(List<AddonModel> addonModels) {
        this.addonModels = addonModels;
    }

    public List<AddonModel> getAddonModels() {
        return addonModels;
    }

    public void setAddonModels(List<AddonModel> addonModels) {
        this.addonModels = addonModels;
    }
}
