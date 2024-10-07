<template>
  <div class="card h-100">
    <!-- Product image-->
    <img class="card-img-top" :src="item.imgPath"/>
    <!-- Product details-->
    <div class="card-body p-4">
      <div class="text-center">
        <!-- Product name-->
        <h5 class="fw-bolder">{{ item.name }}</h5>
        <!-- Product price-->
        {{ lib.getNumberFormatted(item.price) }}원
      </div>
    </div>
    <!-- Product actions-->
    <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
      <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">담기</a></div>
    </div>
  </div>
</template>

<script>
import lib from "@/scripts/lib";


export default {
  name: "Card",
  props: { // props란 부모 컴포넌트에서 자식 컴포넌트로 데이터를 전달받기 위한 속성, 읽기 전용임
    item: Object
  },
  setup() {
    return {lib}
  }
}

</script>

<style scoped>

</style>