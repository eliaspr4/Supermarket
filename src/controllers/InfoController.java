
package controllers;

import views.InfoView;
import models.InfoModel;
public class InfoController {
    InfoView acercaDe;
    InfoModel infoModel;

    public InfoController(InfoView acercaDe, InfoModel infoModel) {
        this.acercaDe = acercaDe;
        this.infoModel = infoModel;
        
        initView();
    }
    
    public void initView() {
        acercaDe.setVisible(true);
    }
}
