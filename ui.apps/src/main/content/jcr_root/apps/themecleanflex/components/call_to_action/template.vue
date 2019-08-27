<template>
  <div class="row" style="height:60px;" v-bind:data-per-path="model.path">
    <div class="col-md-8">
      <p style="margin-left: 5px; margin-top: 10px;">{{model.text}}</p>
    </div>
    <div class="col-md-4">
      <a v-bind:href="model.url">
        <button class="btn btn-success" style="margin-top: 10px;">Subscribe</button>
      </a>
    </div>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

