/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package VideoStoreServer;

/**
 *
 * @author DJ
 */
public class VideoStoreServer {
    
    public VideoStoreServer(){
        new ServerGui().setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new VideoStoreServer();
    }
}
