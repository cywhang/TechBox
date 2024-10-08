<template>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container px-4 px-lg-5 py-3 fs-4">
      <router-link to="/" class="navbar-brand fs-3" href="#!">TechBox</router-link>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
<!--          <li class="nav-item"><a class="nav-link" href="#!">About</a></li>-->
          <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">PC 주요 부품</a>
              <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="#!">All Products</a></li>
                  <li><hr class="dropdown-divider" /></li>
                  <li><a class="dropdown-item" href="#!">Popular Items</a></li>
                  <li><a class="dropdown-item" href="#!">New Arrivals</a></li>
              </ul>
          </li>
        </ul>
        <router-link to="/login" class="login-btn px-4">
          <span class="login-text">로그인</span>
        </router-link> &nbsp;
        <form class="d-flex">
          <button class="btn btn-outline-dark" type="submit">
            <i class="bi-cart-fill me-1"></i>
            장바구니
            <span class="badge bg-dark text-white ms-1 my-2 rounded-pill">0</span>
          </button>
        </form>
      </div>
    </div>
  </nav>
</template>


<script>
export default {
  name: 'Header'
}

</script>


<style scoped>
.login-btn {
  background-color: #4CAF50; /* 버튼 배경 색상 */
  border: none; /* 테두리 제거 */
  color: white; /* 텍스트 색상 */
  padding: 12px 24px; /* 패딩 (위아래, 좌우) */
  font-size: 16px; /* 폰트 크기 */
  border-radius: 8px; /* 둥근 모서리 */
  cursor: pointer; /* 마우스를 올렸을 때 포인터 모양으로 변경 */
  transition: background-color 0.3s ease; /* 배경 색상 전환 애니메이션 */
}

.login-btn:hover {
  background-color: #45a049; /* 호버 시 배경 색상 변경 */
}

.login-text {
  font-weight: bold; /* 텍스트 굵게 */
  text-transform: uppercase; /* 텍스트 대문자 변환 */
}

</style>