package com.example.testre;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    HashMap<String,String>hashMap;
    ArrayList<HashMap<String,String>>arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);

        arrayList=new ArrayList<>();


        hashMap=new HashMap<>();
        hashMap.put("ItemType","BOOK");
        hashMap.put("bookname"," একাত্তরের দিনগুলি");
        hashMap.put("writername","জাহানারা ইমাম");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("ItemType","BOOK");
        hashMap.put("bookname"," একাত্তরের দিনগুলি");
        hashMap.put("writername","জাহানারা ইমাম");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("ItemType","BOOK");
        hashMap.put("bookname"," একাত্তরের দিনগুলি");
        hashMap.put("writername","জাহানারা ইমাম");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("ItemType","BOOK");
        hashMap.put("bookname"," একাত্তরের দিনগুলি");
        hashMap.put("writername","জাহানারা ইমাম");
        arrayList.add(hashMap);
        hashMap=new HashMap<>();
        hashMap.put("ItemType","VIDEO");
        hashMap.put("tittle"," MAGI");
        hashMap.put("writername","জাহানারা ইমাম");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("ItemType","VIDEO");
        hashMap.put("tittle"," MAGI");
        hashMap.put("writername","জাহানারা ইমাম");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("ItemType","VIDEO");
        hashMap.put("tittle"," MAGI");
        hashMap.put("writername","জাহানারা ইমাম");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("ItemType","VIDEO");
        hashMap.put("tittle"," MAGI");
        hashMap.put("writername","জাহানারা ইমাম");
        arrayList.add(hashMap);



        hashMap=new HashMap<>();
        hashMap.put("ItemType","BOOK");
        hashMap.put("bookname"," একাত্তরের দিনগুলি");
        hashMap.put("writername","জাহানারা ইমাম");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("ItemType","BOOK");
        hashMap.put("bookname"," একাত্তরের দিনগুলি");
        hashMap.put("writername","জাহানারা ইমাম");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("ItemType","VIDEO");
        hashMap.put("tittle"," MAGI");
        hashMap.put("writername","জাহানারা ইমাম");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("ItemType","VIDEO");
        hashMap.put("tittle"," MAGI");
        hashMap.put("writername","জাহানারা ইমাম");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("ItemType","VIDEO");
        hashMap.put("tittle"," MAGI");
        hashMap.put("writername","জাহানারা ইমাম");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("ItemType","VIDEO");
        hashMap.put("tittle"," MAGI");
        hashMap.put("writername","জাহানারা ইমাম");
        arrayList.add(hashMap);




        hashMap=new HashMap<>();
        hashMap.put("ItemType","BOOK");
        hashMap.put("bookname"," একাত্তরের দিনগুলি");
        hashMap.put("writername","জাহানারা ইমাম");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("ItemType","BOOK");
        hashMap.put("bookname"," একাত্তরের দিনগুলি");
        hashMap.put("writername","জাহানারা ইমাম");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("ItemType","BOOK");
        hashMap.put("bookname"," একাত্তরের দিনগুলি");
        hashMap.put("writername","জাহানারা ইমাম");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("ItemType","VIDEO");
        hashMap.put("tittle"," MAGI");
        hashMap.put("writername","জাহানারা ইমাম");
        arrayList.add(hashMap);



        Myadapter myadapter=new Myadapter();
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false));





    }

    /// new recycle view

public  class Myadapter extends RecyclerView.Adapter{

        int BOOK_ITEM=0;
        int VIDEO_ITEM=1;




        public class VideoViewHoldar extends RecyclerView.ViewHolder{

            TextView tittle1,tittle2;


            public VideoViewHoldar(@NonNull View itemView) {
                super(itemView);
                tittle1=itemView.findViewById(R.id.tittle1);
                tittle2=itemView.findViewById(R.id.tittle2);



            }
        }

        public class BookviewHOldar extends RecyclerView.ViewHolder{

            TextView name,tittle3;

            public BookviewHOldar(@NonNull View itemView) {
                super(itemView);

                name=itemView.findViewById(R.id.name);
                tittle3=itemView.findViewById(R.id.tittle3);





            }
        }








    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=getLayoutInflater();

        if (viewType==BOOK_ITEM){

         View Myview=   inflater.inflate(R.layout.book,parent,false);


         return new BookviewHOldar(Myview);

        }else {

            View Myview=   inflater.inflate(R.layout.video,parent,false);


            return new VideoViewHoldar(Myview);



        }



    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {




            if (getItemViewType(position)==BOOK_ITEM){

                BookviewHOldar bookviewHOldar= (BookviewHOldar) holder;

                hashMap=arrayList.get(position);

                String bookname=hashMap.get("bookname");
                String writername =hashMap.get("writername");

                bookviewHOldar.name.setText(bookname);
                bookviewHOldar.tittle3.setText(writername);





            } else if (getItemViewType(position)==VIDEO_ITEM){

                VideoViewHoldar videoViewHoldar= (VideoViewHoldar) holder;
                hashMap=arrayList.get(position);



                String tittle=hashMap.get("tittle");
                String writername =hashMap.get("writername");





                videoViewHoldar.tittle1.setText(tittle);




            }
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }







    @Override
    public int getItemViewType(int position) {

            hashMap=arrayList.get(position);

            String ItemType=hashMap.get("ItemType");

            if (ItemType.contains("BOOK"))


                return BOOK_ITEM;


            else

                return VIDEO_ITEM;




    }
}











}