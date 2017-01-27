package com.example.kashif.recyclerviewhome;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by KASHIF on 1/21/2017.
 */

public class FriendDataViewHolder extends RecyclerView.ViewHolder {

    private TextView nameTextView;
    private TextView homeTownTextView;
    private Friend currentFriend;

    public FriendDataViewHolder(View itemView) {
        super(itemView);

        nameTextView = (TextView) itemView.findViewById(R.id.name_tv);
        homeTownTextView = (TextView) itemView.findViewById(R.id.home_town_tv);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("kashif","Friend Clicked " +currentFriend.name);
            }
        });
    }

    public void bindFriend(Friend friend){
        currentFriend = friend;
        nameTextView.setText(friend.name);
        homeTownTextView.setText(friend.homeTown);
    }
}
