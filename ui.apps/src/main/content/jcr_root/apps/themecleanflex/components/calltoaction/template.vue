<template>
  <div v-bind:data-per-path="model.path">
    <p style="display: inline;width:400px;">{{model.text}}</p>
    <a style="position: absolute;right:80px;" v-bind:href="model.url">
      <button>Subscribe</button>
    </a>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

