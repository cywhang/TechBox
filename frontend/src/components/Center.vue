<template>
    <section class="py-5">
      <div class="container px-4 px-lg-5 mt-5">
          <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
              <div class="col mb-5" v-for="(item, idx) in state.items.slice(0, 8)" :key="idx">
                  <Card :item="item"/>
              </div>
          </div>
      </div>
    </section>
</template>

<script>
import {reactive} from "vue";
import Card from "@/pages/Card.vue";
import axios from "axios";

export default {
  name: 'Center',
  components: {Card},
  setup() {
    const state = reactive({
      items: []
    })

    axios.get("api/items").then(({data}) => {
      state.items = data;
    })
    console.log(state);
    return {state}
  }
}
</script>

<style scoped>

</style>