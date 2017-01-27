package com.example.kashif.recyclerviewhome;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KASHIF on 1/21/2017.
 */

public class FriendListAdapter extends RecyclerView.Adapter<FriendDataViewHolder> {

    private List<Friend> friendList;

    public FriendListAdapter(){
        friendList = new ArrayList<>();

        friendList.add(new Friend("Bill","Washington"));
        friendList.add(new Friend("john","Newyork"));
        friendList.add(new Friend("kashif","Ghaziabad"));
        friendList.add(new Friend("Amit","Noida"));
        friendList.add(new Friend("Ankur","Meerut"));
        friendList.add(new Friend("Billu","Amity"));
        friendList.add(new Friend("Bush","Lucknow"));
        friendList.add(new Friend("sanam","Aligarh"));
        friendList.add(new Friend("Satyam","Delhi"));
        friendList.add(new Friend("Suresh","Gurgaon"));
        friendList.add(new Friend("Ramesh","Mumbai"));
        friendList.add(new Friend("Sachin","Pune"));
    }

    @Override
    public FriendDataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("kashif","onCreateViewHolder called");

        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.friend_row,parent,false);

        return new FriendDataViewHolder(view);
    }

    //method to set data in row. this can be called infinite times, depending on how much
    // user is scrolling back and forth
    @Override
    public void onBindViewHolder(FriendDataViewHolder holder, int position) {

        Friend f = friendList.get(position);

        holder.bindFriend(f);

        Log.d("kashif","onBindViewHolder called for position "+position);
    }

    @Override
    public int getItemCount() {
        return friendList.size();
    }
}
