<template>
  <div class="bg-dark">
    <div class="container px-4 px-lg-5">
      <div class="text-center text-white">
        <img src="/img/asdasd.jpg" class="img-fluid slide-img"/>
      </div>
    </div>
  </div>
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
import axios from "axios";
import Card from "@/components/Card.vue";

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
.slide-img {
  width: 100%;               /* 컨테이너에 맞게 가로 크기를 100%로 설정 */
  height: 500px;             /* 원하는 높이 설정 */
  object-fit: cover;         /* 이미지가 컨테이너에 맞게 잘리고 비율 유지 */
  object-position: center;   /* 이미지의 가운데 부분을 잘라서 보여줌 */
}
</style>