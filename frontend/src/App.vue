<template>
  <Header/>
  <RouterView/>
  <Footer/>
</template>
<!-- RouterView란  -->
<!-- 라우트 컴포넌트를 렌더링할 위치를 Vue Router에 알려주는 역할 -->
<script>
import Header from "@/components/Header.vue";
import Footer from "@/components/Footer.vue";
import {useRoute} from "vue-router";


export default {
  name: 'App',
  components: {
    Footer,
    Header
  },
  setup() {
    const route = useRoute();
    console.log('route경로: ', route.path);
  }
}
</script>

<style>

</style>
