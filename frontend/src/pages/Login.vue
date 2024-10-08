<template>
  <div class="container">
    <!-- Heading -->
    <h1>{{ title }}</h1>
    <!-- Links -->
    <ul class="links">
      <li :class="{ active: isSignIn }">
        <a href="#" id="signin" @click.prevent="switchMode('signin')">SIGN IN</a>
      </li>
      <li :class="{ active: !isSignIn }">
        <a href="#" id="signup" @click.prevent="switchMode('signup')">SIGN UP</a>
      </li>
    </ul>
    <!-- Form -->
    <form @submit.prevent="submitForm">
      <!-- email input -->
      <div :class="['input__block', { 'first-input__block': isSignIn, 'signup-input__block': !isSignIn }]">
        <input type="email" placeholder="Email" class="input" id="email" v-model="email" />
      </div>
      <!-- password input -->
      <div class="input__block">
        <input type="password" placeholder="Password" class="input" id="password" v-model="password" />
      </div>
      <!-- repeat password input -->
      <div class="input__block" v-show="!isSignIn">
        <input type="password" placeholder="Repeat password" class="input repeat__password" id="repeat__password" v-model="repeatPassword" />
      </div>
      <!-- sign in/up button -->
      <button class="signin__btn">
        {{ isSignIn ? 'Sign in' : 'Sign up' }}
      </button>
    </form>
    <!-- separator -->
    <div class="separator">
      <p>OR</p>
    </div>
    <!-- 소셜 로그인 buttons -->
    <button class="google__btn">
      <i class="fa fa-google"></i>
      Sign in with Google
    </button>
    <!-- 소셜 로그인 button -->
    <button class="github__btn">
      <i class="fa fa-github"></i>
      Sign in with GitHub
    </button>
  </div>
</template>

<script>
import { ref, computed } from 'vue';

export default {
  setup() {
    const isSignIn = ref(true);
    const email = ref('');
    const password = ref('');
    const repeatPassword = ref('');

    const title = computed(() => isSignIn.value ? 'SIGN IN' : 'SIGN UP');

    const switchMode = (mode) => {
      isSignIn.value = mode === 'signin';
    };

    const submitForm = () => {
      // 폼 제출 로직 구현
      console.log('Form submitted', { email: email.value, password: password.value });
    };

    return {
      isSignIn,
      email,
      password,
      repeatPassword,
      title,
      switchMode,
      submitForm
    };
  }
};
</script>

<style scoped>
body {
  font-family: 'Montserrat', sans-serif;
  background: white;
}

.container {
  display: block;
  max-width: 680px;
  width: 80%;
  margin: 120px auto;
}

h1 {
  color: #e91e63;
  font-size: 48px;
  letter-spacing: -3px;
  text-align: center;
  margin: 120px 0 80px 0;
  transition: 0.2s linear;
}

.links {
  list-style-type: none;
  padding: 0;
}

.links li {
  display: inline-block;
  margin: 0 20px 0 0;
  transition: 0.2s linear;
}

.links li.active {
  opacity: 1;
}

.links li:not(.active) {
  opacity: 0.6;
}

.links li:hover {
  opacity: 1;
}

.links li a {
  text-decoration: none;
  color: #0f132a;
  font-weight: bolder;
  text-align: center;
  cursor: pointer;
}

form {
  width: 100%;
  max-width: 680px;
  margin: 40px auto 10px;
}

.input__block {
  margin: 20px auto;
  display: block;
  position: relative;
}

.input__block.first-input__block::before,
.input__block.signup-input__block::before {
  content: "";
  position: absolute;
  top: -15px;
  left: 50px;
  display: block;
  width: 0;
  height: 0;
  background: transparent;
  border-left: 15px solid transparent;
  border-right: 15px solid transparent;
  border-bottom: 15px solid rgba(15, 19, 42, 0.1);
  transition: 0.2s linear;
}

.input__block.signup-input__block::before {
  left: 150px;
}

.input__block input {
  display: block;
  width: 90%;
  max-width: 680px;
  height: 50px;
  margin: 0 auto;
  border-radius: 8px;
  border: none;
  background: rgba(15, 19, 42, 0.1);
  color: rgba(15, 19, 42, 0.3);
  padding: 0 0 0 15px;
  font-size: 14px;
  font-family: 'Montserrat', sans-serif;
}

.input__block input:focus,
.input__block input:active {
  outline: none;
  border: none;
  color: rgba(15, 19, 42, 1);
}

.signin__btn {
  background: #e91e63;
  color: white;
  display: block;
  width: 92.5%;
  max-width: 680px;
  height: 50px;
  border-radius: 8px;
  margin: 0 auto;
  border: none;
  cursor: pointer;
  font-size: 14px;
  font-family: 'Montserrat', sans-serif;
  box-shadow: 0 15px 30px rgba(233, 30, 99, 0.36);
  transition: 0.2s linear;
}

.signin__btn:hover {
  box-shadow: 0 0 0 rgba(233, 30, 99, 0);
}

.separator {
  display: block;
  margin: 30px auto 10px;
  text-align: center;
  height: 40px;
  position: relative;
  background: transparent;
  color: rgba(15, 19, 42, 0.4);
  font-size: 13px;
  width: 90%;
  max-width: 680px;
}

.separator::before,
.separator::after {
  content: "";
  position: absolute;
  top: 8px;
  background: rgba(15, 19, 42, 0.2);
  height: 1px;
  width: 45%;
}

.separator::before {
  left: 0;
}

.separator::after {
  right: 0;
}

.google__btn,
.github__btn {
  display: block;
  width: 90%;
  max-width: 680px;
  margin: 20px auto;
  height: 50px;
  cursor: pointer;
  font-size: 14px;
  font-family: 'Montserrat', sans-serif;
  border-radius: 8px;
  border: none;
  line-height: 40px;
}

.google__btn {
  background: #5b90f0;
  color: white;
  box-shadow: 0 15px 30px rgba(91, 144, 240, 0.36);
  transition: 0.2s linear;
}

.github__btn {
  background: #25282d;
  color: white;
  box-shadow: 0 15px 30px rgba(37, 40, 45, 0.36);
  transition: 0.2s linear;
}

.google__btn:hover,
.github__btn:hover {
  box-shadow: 0 0 0 rgba(0, 0, 0, 0);
}

.google__btn .fa,
.github__btn .fa {
  font-size: 20px;
  padding: 0 5px 0 0;
}
</style>