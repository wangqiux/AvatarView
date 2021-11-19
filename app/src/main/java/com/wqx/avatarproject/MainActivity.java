package com.wqx.avatarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.wqx.avatar.AvatarView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private AvatarView mAvatarView;
    private ArrayList<String> mAvatarList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        mAvatarView = findViewById(R.id.avatar);
    }

    private void initData() {
        mAvatarList = new ArrayList<>();
        mAvatarList.add("https://img0.baidu.com/it/u=2022894887,995087717&fm=26&fmt=auto");
        mAvatarList.add("https://img1.baidu.com/it/u=1033308816,4202884656&fm=26&fmt=auto");
        mAvatarList.add("https://img1.baidu.com/it/u=3765430397,2499846866&fm=26&fmt=auto");
        mAvatarList.add("https://img0.baidu.com/it/u=3832730987,571401095&fm=15&fmt=auto");
        mAvatarList.add("https://img2.baidu.com/it/u=2976715883,2639398091&fm=26&fmt=auto");
        mAvatarList.add("https://img0.baidu.com/it/u=3686389739,2195281501&fm=26&fmt=auto");
//        mAvatarView.setMaxCount(6);
        mAvatarView.initAvatars(mAvatarList);
//        mAvatarView.addAvatar("http://img3.doubanio.com/view/group_topic/l/public/p314207052.jpg");
    }

    public void onAddAvatar(View view) {
        //下标0 表示最后一个   因为第一个是不会被遮挡的所以要倒着来
        Random random = new Random();
        int index = random.nextInt(mAvatarList.size() - 1);
        mAvatarView.addAvatar(mAvatarList.get(index), mAvatarView.getmAvatarCount());
    }

    public void onDeleteAvatar(View view) {
        //与添加同理   注意下标-1   count指所有的头像
        mAvatarView.deleteAvatar(mAvatarView.getmAvatarCount()-1);
    }
}