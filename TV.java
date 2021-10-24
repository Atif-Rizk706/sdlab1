
package my.work.sction1;


public class TV {
    int channel =1;       //this is the filed of the class
    int volume=1;
    boolean on=false;
    
    public TV()        //this our defult constractor
    {
    }
    public void turnon()       //this function to turn on the TV
    { 
        on =true;
    }
     public void turnoff()      //this function to turn off the TV
    {
        on =false;
    }
     public void setnewchannel(int numofchannel)    //this function to set anew channel on the TV
     {
         if(1<=numofchannel&&numofchannel<=120) {
            if (on==true) {
                channel=numofchannel;
            }
        }
             
     }
      public void setnewcvolumeLevel(int volumeLevel)     //this function to set anew volume on the TV
     {
         if(1<=volumeLevel&&volumeLevel<=7) {
            if (on==true) {
                volume=volumeLevel;
            }
        }
             
     }
      public void ChannelUp()
      {
          if(on==true && channel<120)
              channel++;
      
      }
        public void Channeldown()
      {
          if(on==true && channel>1)
              channel--;
      
      }
        public void volumeUp()
      {
          if(on==true && volume<7)
              volume++;
      
      }
       public void volumedown()
      {
          if(on==true && channel>1)
              volume--;
      
      }
     
    
    
    
}
