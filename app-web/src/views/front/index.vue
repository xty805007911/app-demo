<template>
  <div>
    <Header
      @child-even="parentEven"
      @child-evenTitle="parentEvenTitle"
    ></Header>

    <el-row :gutter="20">
      <el-col :span="1">&nbsp;</el-col>
      <el-col :span="18"><SlideShow></SlideShow></el-col>
      <el-col :span="4"><AboutMe></AboutMe></el-col>
      <el-col :span="1">&nbsp;</el-col>
    </el-row>

      <el-row >
        <el-col :span="2">&nbsp;</el-col>
        <el-col :span="16">
          <ItemList></ItemList>
        </el-col>
         <el-col :span="1">&nbsp;</el-col>
        <el-col :span="5">22</el-col>
      </el-row>
    <Footer></Footer>
  </div>
</template>

<script>
import "@/assets/css/base.css";
import "@/assets/css/m.css";
import Footer from "../../components/Footer";
import Header from "../../components/front/Header";
import SlideShow from "../../components/front/SlideShow";
import AboutMe from "../../components/front/AboutMe";
import ItemList from "../../components/front/ItemList";
export default {
  name: "Index",
  components: {
    Footer,
    Header,
    SlideShow,
    AboutMe,
    ItemList,
  },

  data() {
    return {
      articles: [],
      pages: "",
      total: 0,
      pageNo: "",
      xx: true,
      newData: "",
      title: "",
    };
  },
  beforeRouteUpdate(to, from, next) {
    this.xx = false;
    this.$nextTick(() => {
      this.xx = true;
    });
    next();
  },
  methods: {
    parentEven(data) {
      console.log(data);
      console.log(data);
      console.log("aaaa");
      this.newData = data;
    },
    parentEvenTitle(data) {
      this.title = data;
    },
  },
  mounted() {},
};
</script>

<style scoped>
.lbox {
  height: 650px;
}
</style>