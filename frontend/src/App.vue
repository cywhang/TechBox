<template>
  <Header/>
  <Home/>
  <Footer/>
</template>

<script>
import Header from "@/components/Header.vue";
import Footer from "@/components/Footer.vue";
import Home from "@/Pages/Home.vue";

export default {
  name: 'App',
  components: {
    Footer,
    Header,
    Home,
  }
}
</script>

<style>

</style>
