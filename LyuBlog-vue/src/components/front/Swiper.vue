<template>
  <div class="banbox">
    <!-- <swiper class="swiper"  style="height: 260px;" >
            <swiper-slide v-for="(item,index) in sliders" :key="index">
                <router-link :to="item.url" target="_blank"><img :src="item.img" width="100%" alt=""></router-link>
            </swiper-slide>
    </swiper>-->

    <el-carousel :interval="4000" type="card" height="232px">
      <el-carousel-item v-for="(item,index) in sliders" :key="index">
        <router-link to="" target="_target"><img :src="item.img" width="100%" alt=""></router-link>
      </el-carousel-item>
    </el-carousel>
  </div>
</template>

<script>
//import { Swiper, SwiperSlide } from "vue-awesome-swiper";

import "swiper/swiper-bundle.css";
export default {
  name: "FSwiper",
  components: {
    //Swiper,
    //SwiperSlide
  },
  data() {
    return {
      sliders: [
        {
          img:
            "http://shunxinblog.oss-cn-hangzhou.aliyuncs.com/file/zhaoguoshunnull.jpg",
          url: "www.baidu.com "
        },
        {
          img:
            "http://shunxinblog.oss-cn-hangzhou.aliyuncs.com/2020/12/21/f6ddc4785b514b4eb5711626a65b3102.jpg",
          url: "www.baidu.com "
        },
        {
          img:
            "http://shunxinblog.oss-cn-hangzhou.aliyuncs.com/2020/12/21/8525a2fd67f44882856c0596c76a558d.jpg",
          url: "www.baidu.com "
        },
         {
          img:
            "http://shunxinblog.oss-cn-hangzhou.aliyuncs.com/2020/12/27/93f4a58fe89d443babc592ed86b78731.jpg",
          url: "www.baidu.com "
        },
         {
          img:
            "http://shunxinblog.oss-cn-hangzhou.aliyuncs.com/2020/12/27/05efce18bfe745658704b9db2e0e1564.jpg",
          url: "www.baidu.com "
        }
      ]
    };
  }
};
</script>

<style scoped>
</style>