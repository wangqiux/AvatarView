# AvatarView
可折叠头像view,仿写直播间顶部头像折叠

话不多说  上图

![image](https://user-images.githubusercontent.com/39547430/142557702-42322844-8957-48dc-87cf-df13bc7c7d54.png)




 第一步 在project build文件中添加

        allprojects {
          repositories {
                maven { url 'https://jitpack.io' }
                }
        }
 第二步 添加依赖库
  
     api 'com.github.wangqiux:AvatarView:v1.0.5'
   
 第三步 xml添加布局
  
     <com.wqx.avatar.AvatarView
        android:id="@+id/avatar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        app:marginWidth="1"
        app:isLastComplete="false"
        app:isShowAnimation="false"
        app:isShowFrame="true"
        app:maxCount="6"
        app:radius="20"
        app:space="0.7"/>
	
	
 第四步  初始化头像
 
      mAvatarView.initAvatars(mAvatarList); 
    
 或单独添加头像
 
      mAvatarView.addAvatar(mAvatarList.get(index), mAvatarView.getmAvatarCount());  //添加的链接，添加的位置   没有特殊要求位置  可不填写位置
    
 移除头像
 
      mAvatarView.deleteAvatar(mAvatarView.getmAvatarCount()-1);
