<template>
  <div class="loader">
    <img
      src="../assets/plate.png" class="rotate" />
  </div>
</template>

<script>
export default {
  name: "image-spinner",
};
</script>

<style scoped>

img {
  width: 50%;
  height: auto;
}
.rotate {
  width: 150px;
  animation: rotation 2s  infinite linear ;
}

@keyframes rotation {
  from {
    transform: rotate(0deg);
  }
  to {
    transform: rotate(360deg);
  }
}
</style>