/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//Mohammad Rasheed 202110430
//Ahmad Rami 202020240

package com.mycompany.store;
import java.util.ArrayList;
import javax.swing.*;



/**
 *
 * @author USER
 */
public class Store {
    public static Item item []=new Item[20];
    public static int size=0;
    
    public static String cart[]=new String[10];
    
    public static Sale sale []=new Sale[20];
    public static int size2=0;
    
    public static Customer customer[]=new Customer[20];
    public static int size1=0;

    
    
    
    public static void main(String[] args) {
        for(int i=0;i<cart.length;i++)
        {
            cart[i]="Empty";
        }
        MainMenu();
    }
    public static void MainMenu()
    {
        while(true){
            
        
        String Menu ="store System Menu \n" +"1. Add a new Item to Store \n" 
                     +"2. Add a new Customer to Store \n" 
                     +"3. Add an item to Customer shopping cart \n"
                     +"4. Remove an item from Customer shopping cart \n"
                     +"5. View the items in Customer shopping cart \n"
                     +"6. End shopping and go to checkout \n"
                     +"7. Empty Customer shopping cart \n"
                     +"8. Exit the program ";
         String Num= JOptionPane.showInputDialog(null,Menu);
         int choice =Integer.parseInt (Num);
         switch (choice){
             case 1:AddItem();
                 break;
             case 2:AddCustomer();
                 break;
             case 3 :AddItemToCustomerShoppingCart();
                 break;
             case 4:String Id=JOptionPane.showInputDialog(null, "Enter Customer Number?");
                    int id=Integer.parseInt(Id);
                    RemoveItemFromCustomerShoppingCart(id);
                 break;
             case 5:String IDC=JOptionPane.showInputDialog(null, "Enter id ");
                    int idc=Integer.parseInt(IDC);
                    Display(idc);
                 break;
             case 6:String iDc=JOptionPane.showInputDialog(null, "Enter id ");
                    int IDc=Integer.parseInt(iDc);
                    EndShoppingAndGoToCheckout(IDc);
                 break;
             case 7:String iDc1=JOptionPane.showInputDialog(null, "Enter id ");
                    int IDc1=Integer.parseInt(iDc1);
                    EmptyCustomerShoppingCart(IDc1);
                    
                 break;
             case 8 :System.exit(0);
                 
                 
           }
        
        }
    }

    private static void AddItem() {
        int nu=-1;
        do{
        JTextField id= new JTextField();
        JTextField name= new JTextField();
        JTextField quan= new JTextField();
        JTextField price= new JTextField();
        JTextField type= new JTextField();
        JTextField nameType =new JTextField();
        JTextField author = new JTextField();
        Object [] message={"Enter Item Number: ",id,"Enter Item Name: ",name,"Enter Item Quantity: ",quan,"Enter Item Price: ",price,"Enter the type of item (B)Book, (S)Shoes, (G)Game ?: ",type};
        int YesOrNo= JOptionPane.showConfirmDialog(null, message);
        Object [] Book={"Enter Book Title: ",nameType,"Enter Book Author: ",author};
        Object [] Shoes={"Enter Shoes Type: ",nameType,"Enter Place Of Manufucture: ",author};
        Object [] Game={"Enter Game Type Number: ",nameType,"Enter Place Of Manufucture: ",author};
        int Result1=1;
        if(type.getText().toUpperCase().equals("B"))
        {
            Result1 = JOptionPane.showConfirmDialog(null, Book); 
        }
        if(type.getText().toUpperCase().equals("S"))
        {
            Result1 = JOptionPane.showConfirmDialog(null, Shoes); 
        }
        if(type.getText().toUpperCase().equals("G"))
        {
            Result1 = JOptionPane.showConfirmDialog(null, Game); 
        }
        
        if(YesOrNo==JOptionPane.YES_OPTION && Result1==JOptionPane.YES_OPTION)
        {
           int Id=Integer.parseInt(id.getText());
           int Quan=Integer.parseInt(quan.getText());
           int Price=Integer.parseInt(price.getText());
           String Name=name.getText();
           String NameType=nameType.getText();
           String Type=type.getText();
           String Author=author.getText();
           int index= SearchIdItem( Id);
           int indexName=SearchNameItem(Name);
           if(indexName!=-1)
           {
               item[indexName].AddQuan(Quan);
               JOptionPane.showMessageDialog(null, "The Item Name Already Exists,The New Quantity Will Be Added To The Stored Quantity");
               return;
           }
                   
           if(index== -1)
           {
               item[size]=new Item(Id,Quan,Price,Name,Type,NameType,Author);
               size++;
               JOptionPane.showMessageDialog(null, "The Item Was Added Successfully");
               
               
           }
           else
           {
               JOptionPane.showMessageDialog(null, "The Item Number Already Exists");
           }
           
        }
        
        String re=JOptionPane.showInputDialog(null, "Do You Want Add Another Item (1/0)?");
        nu=Integer.parseInt(re);
        }while(nu==1); 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    private static int SearchIdItem(int Id) {
        
        for(int i=0;i<size;i++)
        {
            if(Id==item[i].getId())
            {
                return i;
            }
        }
        return -1;
        
    }

    private static int SearchNameItem(String Name) {
         for(int i=0;i<size;i++)
        {
            if(Name.equals(item[i].getName()))
            {
                return i;
            }
        }
        return -1;
    }

    private static void AddCustomer() {
         int nu=-1;
         do
         {
             JTextField id= new JTextField();
             JTextField name= new JTextField();
             Object [] message={"Enter Customer Number: ",id,"Enter Customer Name: ",name};
             
             int YES= JOptionPane.showConfirmDialog(null, message);
             if(YES==JOptionPane.YES_OPTION)
             {
                     int Id=Integer.parseInt(id.getText());
                     
                     
                     if(SearchIdCustomer(Id) !=-1)
                     {
                        JOptionPane.showMessageDialog(null,"The customer number is already registered" );
                        return;
                     }
                     
                     boolean status=true;
                     int numberCart=-1;
                     do
                     {    
                     String NoCart="NoCart           Status  \n";
                     for(int i=0;i<cart.length;i++)
                     {
                         NoCart+="      "+(i+1)+"               "+cart[i]+"\n";
                     }
                     
                     String NumberCart=JOptionPane.showInputDialog(null, NoCart);
                      numberCart=Integer.parseInt(NumberCart);
                     
                     if(cart[numberCart-1].equals("Empty"))
                     {
                         cart[numberCart-1]=Id+"";
                         status=false;
                     }
                     }while(status);
                     
                     
                     
                     
                     
                 
                 
                     customer[size1]=new Customer(Id,numberCart-1,name.getText());
                     size1++;
                     JOptionPane.showMessageDialog(null,"Customer added" );
                     
                 
                 
                 
                     
                 
             }
             String re=JOptionPane.showInputDialog(null, "Do You Want Add Another Customer (1/0)?");
             nu=Integer.parseInt(re);
         }while (nu==1);
    }

   

    private static int SearchIdCustomer(int Id) {
         for(int i=0;i<size1;i++)
        {
            if(customer[i].getId()==Id)
            {
                return i;
            }
        }
        return -1;
    }
    
    
    

    private static void AddItemToCustomerShoppingCart() {
        int nu=-1;
        
        do
        {
            String IdCustomer=JOptionPane.showInputDialog(null,"Enter Customer Number ");
            int id=Integer.parseInt(IdCustomer);
            
            
            
             int index=SearchIdCustomer( id);
             
             if(index != -1)
             {
                 int no=AddItemCart(index);
                 if(no==0)
                 {
                     return;
                 }
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"The customer does not exist ");
             }
            
            String NumberYes=JOptionPane.showInputDialog(null,"Do you want try again(1/0) ?");
            nu=Integer.parseInt(NumberYes);
        }while(nu==1);
    }

    private static int AddItemCart(int index) {
        
        int un=-1;
        do{
        String Data="The customer no :"+customer[index].getId()+" ,The customer name : "+customer[index].getName()+".\nItem in the store\n ";
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            list.add(item[i].getName());
            Data+="   " + (i+1) +"_    "+item[i].getId()+"     "+item[i].getName()+   "["+item[i].getQuan()+"] \n";
            
        }
        Data+="....... \n"
              +"0. Return to a main menu \n"  
              +"Enter your item choice :";
        String NumberChoose=JOptionPane.showInputDialog(null,Data);
        int numberChoose=Integer.parseInt(NumberChoose);
        
        if(numberChoose==0)
        {
            return 0;
        }
        else
        {
            String Choose="";
            String nameItem="";
            int Quan=0;
            int idItem=-1;
            for(int i=0;i<size;i++)
            {
                if(list.get(numberChoose-1).equals(item[i].getName()))
                {
                    Quan=item[i].getQuan();
                    idItem=item[i].getId();
                    nameItem=item[i].getName();
                    
                    Choose="The item is  ["+idItem+"   "+nameItem+"    ["+Quan+"]  ] \n Enter the required quantity ";
                    break;
                }
            }
            String Ch=JOptionPane.showInputDialog(null,Choose);
            int quan=Integer.parseInt(Ch);
            if(Quan>=quan && quan>0 && quan !=0)
            {
                sale[size2]=new Sale(customer[index].getId(),idItem,quan,nameItem);
                int total=Quan-quan;
                int IndexNameItem=SearchNameItem(nameItem);
                item[IndexNameItem].setQuan(total);
                size2++;
                JOptionPane.showMessageDialog(null,"The product has been added to the shopping cart");
                return -1;
            }
            String YesOrNo=JOptionPane.showInputDialog(null,"Sorry the required quantity is not available,the available quantity is ["+Quan+"],try again \n "
                                                               
                                                                         +"Do you want add another item to shopping cart (1/0)?");
            un=Integer.parseInt(YesOrNo);
            
          }
        }while(un==1);
        return -1;
    }

    private static void RemoveItemFromCustomerShoppingCart(int id) {
        int SearchId=SearchIdCustomer(id);
        
        if(SearchId !=-1)
        {
            ArrayList<String> nameItemSale=new ArrayList<>();
            ArrayList<Integer> indexSale=new ArrayList<>();


            String Data="The customer no :"+customer[SearchId].getId()+",The customer name :"+customer[SearchId].getName()+". \n";
            for(int i=0;i<size2;i++)
            {
                if(id==sale[i].getIdCustomer())
                {
                   nameItemSale.add(sale[i].getNameItem());
                   indexSale.add(i);
                   Data+="   " + (i+1) +"_    "+sale[i].getIdItem()+"     "+sale[i].getNameItem()+   "["+sale[i].getQuan()+"] \n";
                   
                }
            }
                String Data1="What you want to modify ?\n"
                        +"R. Remove item from shopping cart. \n"
                        +"M. Return to the main menu. \n"
                        +"Enter your choice [R Remove, M main menu]:";
                
                String ch= JOptionPane.showInputDialog(null,Data+"\n"+Data1);
                if(ch.toUpperCase().equals("M"))
                {
                    return;
                }
                else if(ch.toUpperCase().equals("R"))
                {
                    String CH=JOptionPane.showInputDialog(null,Data+".....\n. Return to a main menu\nEnter Your item option number: ");
                    int Ch=Integer.parseInt(CH);
                    if(Ch==0)
                    {
                        return;
                    }
                    String nameIteM= nameItemSale.get(Ch-1);
                    String Message="The item ["+sale[indexSale.get(Ch-1)].getIdItem()+"    "+nameIteM+"    ["+sale[indexSale.get(Ch-1)].getQuan()+"] ] is removed from shopping cart";
                    int Quan=DeleteItem(nameIteM,id);
                    int indexNameItem=SearchNameItem(nameIteM);
                    int total=item[indexNameItem].getQuan()+Quan;
                    item[indexNameItem].setQuan(total);
                    JOptionPane.showMessageDialog(null, Message);
                    
                    
                }
                        
                       
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"The customer is not registered");
        }
    }

    private static int DeleteItem(String nameIteM, int id) {
        for(int i=0;i<size2;i++)
        {
            if(id==sale[i].getIdCustomer())
            {
                if(nameIteM.equals(sale[i].getNameItem()))
                {
                    if(size2-1==i)
                    {
                        int quan=sale[i].getQuan();
                        size2--;
                        return quan;
                    }
                    int quan=sale[i].getQuan();
                    sale[i]=sale[i+1];
                    size2--;
                    return quan;
                }
            }
        }
        return 0;
    }

    private static void Display(int id) {
        if(-1 != SearchIdCustomer(id))
        {
            int TotalPrice=0;
            String Data="Item no   Item name   Quantity   Unit price   Total price ";
            for(int i=0;i<size2;i++)
            {
                if(id==sale[i].getIdCustomer())
                {
                int QU=sale[i].getQuan();
                int index=SearchNameItem(sale[i].getNameItem());
                int Total=QU*item[index].getPrice();
                TotalPrice+=Total;
                
                Data+="\n  "+sale[i].getIdItem()+"                  "+sale[i].getNameItem()+"                  "+QU+"                  "+item[index].getPrice()+"                  "+Total;
                }
            }
            Data+="\n\n                                                                                                 Price : ("+TotalPrice+")";
            JOptionPane.showMessageDialog(null,Data);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"The customer is not exists");
        }
    }

    public static void EndShoppingAndGoToCheckout(int id) {
        if(-1 != SearchIdCustomer(id))
        {
            Display(id);
            Empty(id);
            
            for(int i=0;i<size1;i++)
            {
                if(id==customer[i].getId())
                {
                    for(int j=i;j<size1;j++)
                    {
                        if(size1-1==j)
                        {
                            size1--;
                            JOptionPane.showMessageDialog(null,"Delete Success");
                            break;
                            
                        }
                        customer[i]=customer[i+1];
                    }
                }
            }
            
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"The customer is not exists");
        }
        
    }

    private static void Empty(int id) {
        
         for(int i=0;i<size2;i++)
            {
                if(id==sale[i].getIdCustomer())
                {
                    for(int j=i;j<size2;j++)
                    {
                        if(size2-1==j)
                        {
                            size2--;
                            
                        }
                        sale[i]=sale[i+1];
                    }
                }
            }
        
    }

    private static void EmptyCustomerShoppingCart(int id) {
        if(-1 != SearchIdCustomer(id))
        {
            for(int i=0;i<size2;i++)
            {
                if(id==sale[i].getIdCustomer())
                {
                    int Qu1=sale[i].getQuan();
                    int index=SearchNameItem(sale[i].getNameItem());
                    int Total=Qu1+item[index].getQuan();
                    item[index].setQuan(Total);
                    
                    for(int j=i;j<size2;j++)
                    {
                        if(size2-1==j)
                        {
                            size2--;
                            
                        }
                        sale[i]=sale[i+1];
                    }
                }
            }
        }
        
        else
        {
           JOptionPane.showMessageDialog(null,"The customer is not exists");

        }
    }
            
            

    
    
    
}
