<template>
  <Header/>
  <Center/>
  <Footer/>
</template>

<script>
import Header from "@/components/Header.vue";
import Footer from "@/components/Footer.vue";
import Center from "@/components/Center.vue";

export default {
  name: 'App',
  components: {
    Footer,
    Header,
    Center
  }
}
</script>

<style>

</style>
