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
	
 <declare-styleable name="AvatarView">
        <!--头像的半径,dp为单位-->
        <attr name="radius" format="reference|integer" />
        <!--外边框的宽度-->
        <attr name="marginWidth" format="reference|integer" />
        <!--头像间的距离，为头像直径的长度的百分比，dp为单位-->
        <attr name="space" format="reference|float" />
        <!--最多显示多少个头像-->
        <attr name="maxCount" format="reference|integer" />
        <!--是否最后一个显示完全,默认是true-->
        <attr name="isLastComplete" format="reference|boolean" />
        <!--是否显示动画效果-->
        <attr name="isShowAnimation" format="reference|boolean" />
        <!--是否显示边框-->
        <attr name="isShowFrame" format="reference|boolean" />
        <!--边框颜色-->
        <attr name="frameColor" format="reference|color" />
    </declare-styleable>
    
    第四步  初始化头像
    mAvatarView.initAvatars(mAvatarList); 
     
    或单独添加头像
    mAvatarView.addAvatar(mAvatarList.get(index), mAvatarView.getmAvatarCount());  //添加的链接，添加的位置   没有特殊要求位置  可不填写位置
    
    移除头像
    mAvatarView.deleteAvatar(mAvatarView.getmAvatarCount()-1);
